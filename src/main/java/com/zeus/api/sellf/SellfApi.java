package com.zeus.api.sellf;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.StatusLine;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zeus.api.sellf.exc.SellfApiRequestException;
import com.zeus.api.sellf.request.method.Delete;
import com.zeus.api.sellf.request.method.Get;
import com.zeus.api.sellf.request.method.Post;
import com.zeus.api.sellf.request.method.Put;
import com.zeus.api.sellf.response.GetUniqueResponse;

public class SellfApi {

	public static final String API_URL = "https://api.sellf.io";
	public static final String API_V1 = "v1";
	
	private String token;
	private Gson gson = new GsonBuilder()
//			.excludeFieldsWithoutExposeAnnotation()
			.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
			.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
			.create();
	
	private SellfApi(String token) {
		this.token = token;
	}
	
	public static SellfApi build(String token) {
		return new SellfApi(token);
	}

	public <R extends BaseResponse> R execute(BaseRequest<R> request) throws SellfApiRequestException {
		HttpResponse response;
		try {
			if(request instanceof Get) {
				response = Request
					.Get(makeUri(request))
					.addHeader("Api-Key", token)
					.addHeader("Accept", "application/json")
					.execute()
					.returnResponse();
				
				StatusLine statusLine = response.getStatusLine();
				if(statusLine.getStatusCode() < 400) {
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(
							new InputStreamReader(
								response
									.getEntity()
									.getContent()
							)
						);
						
						if(GetUniqueResponse.class.isAssignableFrom(request.getResponseType())) {
							R ret = request.getResponseType().newInstance();
							getSetDataMethod().invoke(ret, gson.fromJson(reader, ((GetUniqueResponse)ret).getType()));
							return ret;
						}
						
						return gson.fromJson(reader, request.getResponseType());
					} finally {
						if(reader!=null) reader.close();
					}
				}
				else throw new SellfApiRequestException(
					statusLine.getStatusCode(), 
					statusLine.getReasonPhrase()
				);
			} else if(request instanceof Delete) {
				response = Request
					.Delete(makeUri(request))
					.addHeader("Api-Key", token)
					.addHeader("Accept", "application/json")
					.execute()
					.returnResponse();
				
				StatusLine statusLine = response.getStatusLine();
				if(statusLine.getStatusCode() != 200) {
					throw new SellfApiRequestException(
						statusLine.getStatusCode(), 
						statusLine.getReasonPhrase()
					);
				}
			} else if(request instanceof Post) {
				response = Request
					.Post(makeUri(request))
					.addHeader("Api-Key", token)
					.addHeader(HTTP.CONTENT_TYPE, "application/json")
					.addHeader("Accept", "application/json")
					.body(makeEntity((Post)request))
					.execute()
					.returnResponse();
				
				StatusLine statusLine = response.getStatusLine();
				if(statusLine.getStatusCode() < 400) {
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(
							new InputStreamReader(
								response
									.getEntity()
									.getContent()
							)
						);
						
						if(GetUniqueResponse.class.isAssignableFrom(request.getResponseType())) {
							R ret = request.getResponseType().newInstance();
							getSetDataMethod().invoke(ret, gson.fromJson(reader, ((GetUniqueResponse)ret).getType()));
							return ret;
						}
						
						return gson.fromJson(reader, request.getResponseType());
					} finally {
						if(reader!=null) reader.close();
					}
				}
				else throw new SellfApiRequestException(
					statusLine.getStatusCode(), 
					statusLine.getReasonPhrase()
				);
			} else if(request instanceof Put) {
				response = Request
					.Put(makeUri(request))
					.addHeader("Api-Key", token)
					.addHeader(HTTP.CONTENT_TYPE, "application/json")
					.addHeader("Accept", "application/json")
					.body(makeEntity((Put)request))
					.execute()
					.returnResponse();
				
				StatusLine statusLine = response.getStatusLine();
				if(statusLine.getStatusCode() < 400) {
					BufferedReader reader = null;
					try {
						reader = new BufferedReader(
							new InputStreamReader(
								response
									.getEntity()
									.getContent()
							)
						);
						
						if(GetUniqueResponse.class.isAssignableFrom(request.getResponseType())) {
							R ret = request.getResponseType().newInstance();
							getSetDataMethod().invoke(ret, gson.fromJson(reader, ((GetUniqueResponse)ret).getType()));
							return ret;
						}
						
						return gson.fromJson(reader, request.getResponseType());
					} finally {
						if(reader!=null) reader.close();
					}
				}
				else throw new SellfApiRequestException(
					statusLine.getStatusCode(), 
					statusLine.getReasonPhrase()
				);
			}
		} catch (Throwable e) {
			if (e instanceof SellfApiRequestException)
				throw (SellfApiRequestException)e;
			else
				throw new SellfApiRequestException(e);
		} 
		
		return null;
	}
	
	private URI makeUri(BaseRequest request) throws URISyntaxException {
		URIBuilder uri = new URIBuilder(API_URL + "/" + API_V1 + "/" + request.urlPart());
		uri.addParameters(getParams(request));
		return uri.build();
	}
	
	private HttpEntity makeEntity(Post request) {
		return new StringEntity(gson.toJson(request.getData()), ContentType.APPLICATION_JSON);
	}
	
	private HttpEntity makeEntity(Put request) {
		return new StringEntity(gson.toJson(request.getData()), ContentType.APPLICATION_JSON);
	}
	
	public static boolean set(Object object, String fieldName, Object fieldValue) {
	    Class<?> clazz = object.getClass();
	    while (clazz != null) {
	        try {
	            Field field = clazz.getDeclaredField(fieldName);
	            field.setAccessible(true);
	            field.set(object, fieldValue);
	            return true;
	        } catch (NoSuchFieldException e) {
	            clazz = clazz.getSuperclass();
	        } catch (Exception e) {
	            throw new IllegalStateException(e);
	        }
	    }
	    return false;
	}
	
	private Method getSetDataMethod() {
		for(Method m : GetUniqueResponse.class.getDeclaredMethods()) {
			if(m.getName().equals("setData"))
				return m;
		}
		return null;
	}
	
	private List<NameValuePair> getParams(BaseRequest request) {
		Map<String, Object> map = request.params();
		if(map == null) map = new HashMap<String, Object>();
		List<NameValuePair> retList = new ArrayList<NameValuePair>();
		for(Entry<String, Object> entry : map.entrySet()) {
			retList.add(new BasicNameValuePair(entry.getKey(), entry.getValue().toString()));
		}
		return retList;
	}
	
	public static void main(String[] args) {
		for(Method m : GetUniqueResponse.class.getDeclaredMethods()) {
			System.out.println(m.toGenericString());
		}
	}
}

# java-sellf-api
Java client for Sellf API - http://developers.sellfcrm.com

### How to make a request
* Take your token from https://app.sellf.io/settings/api
* Create your API client
```java
	String token = "<YOUR_TOKEN>";
	SellfApi apiClient = SellfApi.build(token);
```
* Create your first request - Get all available users
```java
	GetUsers req = new GetUsers();
	try {
		GetUsersResponse resp = SellfApi.build(token).execute(req);
		List<User> users = resp.list();
		/* Do whatever with your users list */
	} catch (SellfApiRequestException e) {
		/* Manage your error here */
	}
```
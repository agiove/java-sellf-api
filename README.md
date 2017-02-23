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

### Contributing

__All the contributions are very welcomed.__
Just follow the steps below:
- [Fork](https://help.github.com/articles/fork-a-repo/) the main repository. 
- Clone your fork and set the upstream remote to the main repository.
- Create a topic branch from where you want to base your work.
- Setup your local environment to run and build the library with Maven.
- Make commits of logical units.
- Push your changes to a topic branch in your fork of the repository.
- [Submit a pull request](https://help.github.com/articles/about-pull-requests/).

### License

The Java Sellf API library is licensed under the MIT license.

### Feedback

If you find a bug or want to request a new feature, please open a [GitHub issue](https://github.com/agiove/java-sellf-api/issues).
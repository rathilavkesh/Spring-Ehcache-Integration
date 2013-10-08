Spring-Ehcache-Integration
==========================

This project explains adding caching to methods using Ehcache Annotations for Spring project. 
We can customized our caching mechanism your this annotation. 
We cache methode return value and when second time user try to access same methode it will return that cache value instead of actually executing the methode.

For Example:   For example, suppose you have a method: Dog getDog(String name).

Once caching is added to this method, all calls to the method will be cached using the "name" parameter as a key.

So, assume at time t0 the application calls this method with the name equal to "fido". Since "fido" doesn't exist, the method is allowed to run, generating the "fido" Dog object, and returning it. This object is then put into the cache using the key "fido".

Then assume at time t1 the application calls this method with the name equal to "spot". The same process is repeated, and the cache is now populated with the Dog object named "spot".

Finally, at time t2 the application again calls the method with the name "fido". Since "fido" exists in the cache, the "fido" Dog object is returned from the cache instead of calling the method.


You can find more information about this on below website:  


http://ehcache.org/documentation/recipes/spring-annotations
https://code.google.com/p/ehcache-spring-annotations/wiki/UsingCacheable

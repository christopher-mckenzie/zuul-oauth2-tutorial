## zuul-oauth2-tutorial
* composite application
    * base-application 1 & 2 used for testing configuration
        * changing config files on the fly will cause app to hit base app 1 or 2
    * zuul-application
        * controls routes uses spring config server to read - [config files](https://github.com/christopher-mckenzie/zuul-oauth2-tutorial-config)
        * uses oauth2 when contacting base apps

---
### yaml definitions (simple)
* under routes define all routes
    * first prop under routes is the route name
    * path is the url path envoked ** indicates it can consume anything after defined path
    * url is the to redirect
        * if anything is after ** this is appen
        ded to the defined url

#### sample yaml
``` yml
zuul:
 routes:
   first:
     path: /first/**
     url: http://first.example.com
```

---
### helpful-links
* zuul route info 
    * localhost:port/routes (POST) - will also do a refresh
    * localhost:port/routes?format=details (GET)
* config refresh
    * localhost:port/refresh (POST)
    
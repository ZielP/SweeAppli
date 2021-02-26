# SweeAppli
Custom Rest API with cookies recipes that are stored in a local MySQL database. I'm also working on developing an Android app that will connect to this API.

## Progres:
- API - Completed. Maybe in the future, I'll expand the structure once the Android application is complete.
- Android app - Working on.

## About API

The Spring boot API is connected to a local MySQL database. At the start of the application, ten different cookie recipes are added to the database.

**Mapping:** /api/cookie

**Functionality:**
- Retrieving all cookies or one cookie by ID
- Deleting a cookie by ID
- Adding a cookie by ID
- Updating a cookie by ID and checking if the specified parameters are empty or the same as before

## How to run it
I recommend running it on your local MySQL database server. You can download it for free from [here](https://dev.mysql.com/downloads/workbench/).
After installation create a new database.
You can also create a new user but it is not necessary, cause you can use root user.
After that, you have to change some parameters inside the *application.properties*

```
 spring.datasource.url = jdbc:mysql://localhost:3306/[your_database_name]?useUnicode=true&serverTimezone=UTC
 spring.datasource.username=[your_database_username]
 spring.datasource.password=[your_database_user_password]
```
**localhost:3306 is the default port, but can be different**

## Example result

Mapping: ("localhost:8080/api/cookie/1")
```yaml
[
{

"id":  1,

"name":  "Peanut Butter Cookies",

"ingredients":  [

"1 cup shortening",

"1 cup peanut butter",

"1 cup sugar",

"1 cup packed brown sugar",

"3 large eggs, room temperature",

"3 cups all-purpose flour",

"2 teaspoons baking soda",

"1/4 teaspoon salt"

],

"recipe":  "Preheat oven to 375°. In a large bowl, cream shortening, peanut butter and sugars until light and fluffy, 5-7 minutes. Add eggs, 1 at a time, beating well after each addition. Combine flour, baking soda and salt; add to creamed mixture and mix well.\n Roll into 1-1/2-in. balls. Place 3 in. apart on ungreased baking sheets. Flatten with a fork or meat mallet if desired. Bake 10-15 minutes. Remove to wire racks to cool."

}
]
```

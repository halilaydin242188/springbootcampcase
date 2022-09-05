# Spring boot rest-api tests

## Entities
* User
* Product
* Productcomments

## Request handlers
### Get handlers
* Get product comments by product id : localhost:8080/api/productcomment/byProductId/{productId}
    productId parameter accepts an integer
    example : localhost:8080/api/productcomment/byProductId/17

* Get product comments by product id and between 2 dates : localhost:8080/api/productcomment/byProductIdBetweenDates
    productId(int), startDate(date), endDate(date) parameters should be included in the URL
    example : localhost:8080/api/productcomment/byProductIdBetweenDates?productId=17&startDate=2019-01-09&endDate=2030-01-02

* Get product comments by user id : localhost:8080/api/productcomment/byUserId/{userId}
    userId parameter accepts an integer
    example : localhost:8080/api/productcomment/byUserId/20



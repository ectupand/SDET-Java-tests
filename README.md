# SDET-Java-tests
Установить зависимости ```mvn install```  
Запускать тесты из ```src/test/java/sauceDemo/SauceDemoTest.java```
  

## Кейс 1  
Проверка успешной покупки - checkSuccessBuy()  
Предусловие:  
1. Открыть браузер  
2. Перейти на страницу входа: https://www.saucedemo.com/  
3. Заполнить поле Username значением standard_user  
4. Заполнить поле Password значением secret_sauce  
5. Нажать на кнопку LOGIN  
  
Шаги:
1.  Положить первый продукт в списке на странице PRODUCTS в корзину кнопкой ADD TO CART  
2. Нажать на иконку корзины.  
3. На открывшейся странице корзины нажать кнопку CHECKOUT  
4. На открывшейся странице CHECKOUT: YOUR INFORMATION заполнить поля First Name, Last Name, Zip Code значением test  
5. Нажать на кнопку CONTINUE  
6. На открывшейся странице CHECKOUT: OVERVIEW нажать кнопку FINISH  
  
Ожидаемый результат:  
1. Произошел редирект на страницу завершения покупки: https://www.saucedemo.com/checkout-complete.html  
2. На странице отображается сообщение: “THANK YOU FOR YOUR ORDER”  
  
    
## Кейс 2  
Проверка сообщения об ошибке при попытке ввода логина на несуществующего пользователя - checkErrorOnInvalidLogin()  
Предусловие:  
1. Открыть браузер  
2. Перейти на страницу входа: https://www.saucedemo.com/  
  
Шаги:  
1. Заполнить поле Username значением test  
2. Заполнить поле Password значением test  
3. Нажать на кнопку LOGIN  
  
Ожидаемый результат:
1. На странице появилось сообщение: “Epic sadface: Username and password do not match any user in this service”

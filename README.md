# OT-OIL test task

## Тестовое задание: 
1. Настроить среду разработки на ПК 
2. Автоматизировать сценарии:
 
Сценарий 1: 
- Для сайта https://ya.ru/ создать следующие сценарии: 
- Открыть страницу https://ya.ru/ 
- Ввести в строку поиска текст "Основы автоматизации тестирования" 
- Нажать кнопку "Найти" 
- Проверить, что вернулись результаты поиска 

Сценарий 2: 
- Открыть страницу https://yandex.ru/ 
- Проверить, что на загруженной странице отображается блок с новостями и блок с погодой 
- Проверить, что дата на загруженной странице соответствует текущей

## Запуск тестов: 

Запуск всех тестов
```
gradle allTests -DisHeadless=true
```
* isHeadless (type boolean) - режим запуска окна браузера, может быть true / false, по дефолту false.

Зауск тестов для первого сценария
```
gradle yandexSearchTests -DisHeadless=true
```
* isHeadless (type boolean) - режим запуска окна браузера, может быть true / false, по дефолту false.

Зауск тестов для второго сценария
```
gradle yandexMainTests -DisHeadless=true
```
* isHeadless (type boolean) - режим запуска окна браузера, может быть true / false, по дефолту false.

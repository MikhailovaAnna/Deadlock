## Задание

### Написать программу, приводящую к ситуации взаимной блокировки (deadlock).

## Инструкция пользователя

Запустить программу, на экране выведется:
```
Thread-0 got obj1
Thread-1 got obj2
Thread-1 trying to get obj1
Thread-0 trying to get obj2
...
```
Как видно, заполучить объект 1 и объект 0 у потоков так и не получилось.

## Дополнительное задание:

### В маленьком интернет кафе в деревне есть N компьютеров. Кафе работает по принципо FIFO, т.е. когда все компьютеры заняты, то очередному желающему необходимо подождать. В кафе приходит M туристов. Турист проводит за компьютером от 15 минут до 2 часов (время выбирается случайно). Напишите программу, которая имитирует порядок доступа к компьютерам в кафе и выводит журнал доступа на экран в процессе работы. Необходимо так выбрать масштаб для времени в имитации, чтобы время выполнение программы было меньше 3 минут.
 
### N и M вводятся с клавиатуры. Можно использовать Thread.sleep(4000);

## Инструкция пользователя

Запускаем программу, вводим значение N и M, далее следим за очередью.
```
Enter the number of computer for cafe: 5
Enter the number of tourists: 15
Tourist1 waiting for turn.
Tourist2 waiting for turn.
Tourist3 waiting for turn.
Tourist4 waiting for turn.
Tourist5 waiting for turn.
Tourist6 waiting for turn.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist2 waiting for turn.
Tourist3 waiting for turn.
Tourist4 waiting for turn.
Tourist5 waiting for turn.
Tourist6 waiting for turn.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist1 is online.
Tourist3 waiting for turn.
Tourist4 waiting for turn.
Tourist5 waiting for turn.
Tourist6 waiting for turn.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist0 is online.
Tourist2 is online.
Tourist4 waiting for turn.
Tourist5 waiting for turn.
Tourist6 waiting for turn.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist3 is online.
Tourist5 waiting for turn.
Tourist6 waiting for turn.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist4 is online.
Tourist0 is done, having spent 60 minutes online.
Tourist6 waiting for turn.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist5 is online.
Tourist4 is done, having spent 72 minutes online.
Tourist7 waiting for turn.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist6 is online.
Tourist3 is done, having spent 83 minutes online.
Tourist8 waiting for turn.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist7 is online.
Tourist14 waiting for turn.
Tourist2 is done, having spent 105 minutes online.
Tourist9 waiting for turn.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist8 is online.
Tourist1 is done, having spent 109 minutes online.
Tourist10 waiting for turn.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist9 is online.
Tourist6 is done, having spent 75 minutes online.
Tourist11 waiting for turn.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist10 is online.
Tourist9 is done, having spent 48 minutes online.
Tourist12 waiting for turn.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist11 is online.
Tourist8 is done, having spent 61 minutes online.
Tourist13 waiting for turn.
Tourist14 waiting for turn.
Tourist12 is online.
Tourist7 is done, having spent 85 minutes online.
Tourist14 waiting for turn.
Tourist13 is online.
Tourist5 is done, having spent 114 minutes online.
Tourist14 is online.
Tourist10 is done, having spent 35 minutes online.
Tourist13 is done, having spent 50 minutes online.
Tourist12 is done, having spent 75 minutes online.
Tourist11 is done, having spent 115 minutes online.
Tourist14 is done, having spent 112 minutes online.
The place is empty!
```
Как видим, все туристы успешно закончили свое времяпровождение в нашем кафе.
Запуск приложения java -jar ./mock-tba.jar

Для операции получения списка продуктов сделана файловая зашлушка, заглушки лежат в папке рядом credit-card-product с jar файлом.

В запросе {offerId} равен имени файла без расшерения.

Пример запроса:
http://localhost:9090/virtual/offers/1/products

Верёнт ответ из файла 1.json лежащего в папке credit-card-product.
Для добавления новых файлов или редактирования имеющихся перезапуск приложения не нужен.

Настройки приложения лежат в файле application.properties

server.port = 9090 // порт на котором будет работать приложение
logging.level.root=ERROR // уровень логирования
logging.file: application-debug.log // файл куда будут писаться логи приложения


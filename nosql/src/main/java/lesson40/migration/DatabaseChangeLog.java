package lesson40.migration;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lesson40.model.Genre;
import lesson40.repository.GenreRepository;
import org.bson.Document;

@ChangeLog
public class DatabaseChangeLog {

    /*
    TODO:не проходят миграции. Рефлекшн получает пустые url:
    org.reflections.Reflections: given scan urls are empty. set urls in the configuration
    c.g.c.m.r.c.executor.MigrationExecutor: Mongock skipping the data migration. All change set items are already executed or there is no change set item.
    */

    // в order указывается последовательность выполнения

    @ChangeSet(order = "001", id = "dropDb", author = "Kirill Block", runAlways = true)
    public void dropDb(MongoDatabase db) {
        db.drop(); // сбрасываем БД
    }

    @ChangeSet(order = "002", id = "insertNewGenre", author = "Kirill Block")
    public void insertNewGenre(MongoDatabase db) {
        MongoCollection<Document> myCollection = db.getCollection("genre");
        var doc = new Document() // ниже добавляются новые аттрибуты
                .append("_id", "New")
                .append("name", "Новый");
        myCollection.insertOne(doc);
    }

    @ChangeSet(order = "003", id = "insertNewGenreAnotherWay", author = "Kirill Block")
    public void insertPushkin(GenreRepository repository) {
        repository.save(new Genre("new2", "Новый2"));
    }
}
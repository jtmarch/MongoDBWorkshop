package course;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BlogPostDAO {
    MongoCollection<Document> postsCollection;

    public BlogPostDAO(final MongoDatabase blogDatabase) {
        // ### Workshop Assignment 3 - stap 1
        // 1. Connect to the 'posts' collection
        postsCollection = null;
    }

    // Return a single post corresponding to a permalink
    public Document findByPermalink(String permalink) {

        // ### Workshop Assignment 3 - stap 2
        // 1. Get a post by 'permalink' (unique)
        Document post = null;

        return post;
    }

    // Return a list of posts in descending order. Limit determines
    // how many posts are returned.
    public List<Document> findByDateDescending(int limit) {

        // ### Workshop Assignment 3 - stap 3
        // 1. Return a list of DBObjects, each one a post from the posts collection
        // 2. Don't forget to add the limit
        // 3. Sort by 'date' descending
        List<Document> posts = null;

        return posts;
    }


    public String addPost(String title, String body, List tags, String username) {

        System.out.println("inserting blog entry " + title + " " + body);

        String permalink = title.replaceAll("\\s", "_"); // whitespace becomes _
        permalink = permalink.replaceAll("\\W", ""); // get rid of non alphanumeric
        permalink = permalink.toLowerCase();


        // ### Workshop Assignment 3 - stap 4
        // 1. Add a new post
        // Remember that a valid post has the following keys:
        // author, body, permalink, tags, comments, date
        //
        // A few hints:
        // - Don't forget to create an empty list of comments
        // - for the value of the date key, today's datetime is fine.
        // - tags are already in list form that implements suitable interface.
        // - we created the permalink for you above.

        // Build the post object and insert it
        Document post = null;


        return permalink;
    }




    // White space to protect the innocent








    // Append a comment to a blog post
    public void addPostComment(final String name, final String email, final String body,
                               final String permalink) {

        // ### Workshop Assignment 3 - stap 5
        // 1. Add a blog comment for the blog with given 'permalink'
        // Hints:
        // - email is optional and may come in NULL. Check for that.
        // - best solution uses an update command to the database and a suitable
        //   operator to append the comment on to any existing list of comments

    }
}

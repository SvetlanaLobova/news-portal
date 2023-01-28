package org.newportal.service;

import org.newportal.database.entity.News;
import org.newportal.database.entity.User;
import org.newportal.database.repository.NewsPortalRepository;
import org.newportal.database.repository.impl.NewsPortalRepositoryImpl;

public class Demo {
    public static void main(String[] args) {
        NewsPortalRepository newsPortalRepository = new NewsPortalRepositoryImpl();
        User user = new User("1","login", "123");
        News news = new News("1", "Title", "Content", "1");
        News createdNews = newsPortalRepository.createNews(news);
        System.out.println(createdNews);

        User user2 = new User("1","login", "33");
        System.out.println(user.equals(user2));
    }
}

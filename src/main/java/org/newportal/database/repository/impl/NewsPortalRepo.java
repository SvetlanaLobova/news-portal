package org.newportal.database.repository.impl;

public class NewsPortalRepo extends  NewsPortalRepositoryImpl {
    public String findByLogin(Long id, String login) {
        return id + login;
    }
}

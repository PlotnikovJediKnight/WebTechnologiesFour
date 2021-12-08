package by.bsuir.wt.four.builder;

import by.bsuir.wt.four.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
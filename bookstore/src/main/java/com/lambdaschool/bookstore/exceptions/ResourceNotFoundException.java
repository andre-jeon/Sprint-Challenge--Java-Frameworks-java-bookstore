package com.lambdaschool.bookstore.exceptions;

/**
 * A custom exception to be used when a resource is not but is suppose to be
 */
public class ResourceNotFoundException
        extends RuntimeException
{
    public ResourceNotFoundException(String message)
    {
        super("RESOURCE NOT FOUND : Error from a Lambda School Application " + message);
    }
}
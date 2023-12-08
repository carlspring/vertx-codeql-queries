// Generated automatically from io.vertx.core.file.FileProps for testing purposes

package io.vertx.core.file;


public interface FileProps
{
    boolean isDirectory();
    boolean isOther();
    boolean isRegularFile();
    boolean isSymbolicLink();
    long creationTime();
    long lastAccessTime();
    long lastModifiedTime();
    long size();
}

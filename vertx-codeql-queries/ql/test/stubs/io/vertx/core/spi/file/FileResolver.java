// Generated automatically from io.vertx.core.spi.file.FileResolver for testing purposes

package io.vertx.core.spi.file;

import java.io.Closeable;
import java.io.File;

public interface FileResolver extends Closeable
{
    File resolveFile(String p0);
    void close();
}

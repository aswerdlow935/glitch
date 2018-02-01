package org.usfirst.frc862.util;

import edu.wpi.first.wpilibj.SerialPort;

import java.io.IOException;
import java.io.Reader;

class SerialReader extends Reader {
    private SerialPort port;

    public SerialReader(SerialPort port) {
        this.port = port;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        byte[] bytes = port.read(len);
        len = Math.min(len, bytes.length);

        for (int i = 0; i < len; ++i) {
            cbuf[off + i] = (char) bytes[i];
        }

        return len;
    }

    @Override
    public void close() throws IOException {
        port.flush();
    }
}
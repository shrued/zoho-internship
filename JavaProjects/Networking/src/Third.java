import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Third {
    static void write() {
        try {
            RandomAccessFile aFile = new RandomAccessFile("file.txt","rw");
            FileChannel inChannel = aFile.getChannel();
            long fileSize = inChannel.size();

            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
            inChannel.read(buffer);
            buffer.flip();

            String newData = "\nHow you doin'";

            buffer.put(newData.getBytes());

            buffer.flip();

            while(buffer.hasRemaining()) {
                inChannel.write(buffer);
            }

            inChannel.close();
            aFile.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void read() {
        try {
            RandomAccessFile aFile = new RandomAccessFile("file.txt","rw");
            FileChannel inChannel = aFile.getChannel();
            long fileSize = inChannel.size();

            ByteBuffer buffer = ByteBuffer.allocate((int) fileSize);
            inChannel.read(buffer);
            buffer.flip();

            for (int i = 0; i < fileSize; i++) {
                System.out.print((char) buffer.get());
            }

            inChannel.close();
            aFile.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        read();
        write();
    }
}
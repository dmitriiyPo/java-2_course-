package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileDemo
{

    /**
     * 1 запись
     * @param arr массив
     * @param stream двоичный поток с для записи
     * @throws IOException искл
     */
    public static void RecordingB(int[] arr, OutputStream stream) throws IOException //запись
    {
        try(DataOutputStream dataOutputStream = new DataOutputStream(stream))
        {
            for (int i : arr)
            {
                dataOutputStream.writeInt(i);
            }
        }
    }

    /**
     * 1 чтение
     * @param read двоичный поток с массивом
     * @param arr массив
     */
    public static void ReadingB(InputStream read, int[] arr) throws IOException //чтение
    {
        try (DataInputStream dataInputStream = new DataInputStream(read))
        {
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = dataInputStream.readInt();
            }
        }
    }

    /**
     * 2 запись
     * @param arr массив
     * @param writer символьны поток для записи
     */
    public static void RecordingS(int[] arr, Writer writer)
    {
        try (PrintWriter printWriter = new PrintWriter(writer)) //не разбивается на отдельные символы
        {
            for (int i = 0; i < arr.length; i++)
            {
                printWriter.write(String.valueOf(arr[i]));
                if (i < arr.length - 1)
                {
                    printWriter.write(" ");
                }
            }
        }
    }

    /**
     * 2 чтение
     * @param read символьны поток с массивом
     * @param arr массив
     * @throws IOException искл
     */
    public static void ReadingS(Reader read, int[] arr) throws IOException //чтение
    {
        try (BufferedReader stringReader = new BufferedReader(read))
        {
            String[] sArr = stringReader.readLine().split(" ");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = Integer.parseInt(sArr[i]);
            }
        }
    }

    /**
     * 3
     * @param filename название файла для чтения
     * @param arr массив
     * @param x с этого места читать
     * @throws IOException искл
     */
    public static void ReadingFromAGivenLocation(String filename, int[] arr, int x) throws IOException
    {                                                                       //класс ранд позволяет читать с задоного места
        try (RandomAccessFile read = new RandomAccessFile(filename, "r"))
        {
            read.seek(x * 4L); //переместили курсор на это место
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = read.readInt();
            }
        }
    }

    /**
     * 4
     * @param directory каталог
     * @param ext расшиение (в виде ".расширение")
     * @return список файлов с данным расширением
     */
    public static List<File> ListOfExtensions(File directory, String ext)
    {
        if (!directory.isDirectory())
        {
            throw new IllegalArgumentException("это не каталог");
        }
        List<File> res = new ArrayList<>();
        for (File f : Objects.requireNonNull(directory.listFiles())) //Проверяет, что указанная ссылка на объект не является .null
        {
            if (f.getName().endsWith(ext))
            {
                res.add(f);
            }
        }
        return res;
    }
}
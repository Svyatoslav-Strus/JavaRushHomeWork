package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created with IntelliJ IDEA.
 * User: HomeSweet
 * Date: 22.02.14
 * Time: 13:06
 * To change this template use File | Settings | File Templates.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes imageTypes)
    {
        ImageReader reader;

        if (imageTypes == ImageTypes.JPG)
        {
            reader = new JpgReader();
        }
        else if (imageTypes == ImageTypes.BMP)
        {
            reader = new BmpReader();
        }
        else if (imageTypes == ImageTypes.PNG)
        {
            reader = new PngReader();
        }
        else
        {
            throw  new  IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }
}

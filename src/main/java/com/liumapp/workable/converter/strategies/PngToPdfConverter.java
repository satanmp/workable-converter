package com.liumapp.workable.converter.strategies;

import com.liumapp.workable.converter.core.Parameter;
import com.liumapp.workable.converter.exceptions.ConvertFailedException;

/**
 * file PngToPdfConverter.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2019/5/10
 */
public class PngToPdfConverter extends ConverterStrategy {

    @Deprecated
    @Override
    public boolean convert(Parameter require) throws ConvertFailedException {
        return false;
    }
}

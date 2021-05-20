package com.pdax.core.factory;

import com.pdax.core.Generate;
import com.pdax.core.GenerateCodeFactory;
import com.pdax.core.impl.ApplicationImpl;

/**
 * @author Fly Tiger
 * @date 2021/5/19
 */
public class ApplicationGenerateFactory implements GenerateCodeFactory {


    @Override
    public Generate createFactory() {
        return new ApplicationImpl();
    }
}

package com.pdax.core.factory;

import com.pdax.core.Generate;
import com.pdax.core.GenerateCodeFactory;
import com.pdax.core.impl.InterfacesImpl;

/**
 * @author Fly Tiger
 * @date 2021/5/19
 */
public class InterfacesGenerateFactory implements GenerateCodeFactory {

    @Override
    public Generate createFactory() {
        return new InterfacesImpl();
    }
}

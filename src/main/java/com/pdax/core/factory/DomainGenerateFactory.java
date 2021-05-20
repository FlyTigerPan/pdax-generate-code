package com.pdax.core.factory;

import com.pdax.core.Generate;
import com.pdax.core.GenerateCodeFactory;
import com.pdax.core.impl.ApplicationImpl;
import com.pdax.core.impl.DomainImpl;

/**
 * @author Fly Tiger
 * @date 2021/5/19
 */
public class DomainGenerateFactory implements GenerateCodeFactory {

    @Override
    public Generate createCode() {
        return new DomainImpl();
    }
}

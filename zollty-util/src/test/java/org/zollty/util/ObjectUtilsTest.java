/* 
 * Copyright (C) 2013-2015 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * Create by ZollTy on 2014-6-12 (http://blog.zollty.com/, zollty@163.com)
 */
package org.zollty.util;

import org.junit.Test;
import org.junit.Assert;

/**
 * @author zollty
 * @since 2014-6-12
 */
public class ObjectUtilsTest {
    
    @Test
    public void testArrayToString () {
        
        Object[] params = new Object[]{"asdsda", new Long(1223), null, new Boolean(true)};
        
        String result = ObjectUtils.arrayToString(params);
        Assert.assertEquals("{[asdsda],[1223],null,[true]}", result);
        
        params = new Object[]{null};
        result = ObjectUtils.arrayToString(params);
        Assert.assertEquals("{null}", result);
        
        params = null;
        result = ObjectUtils.arrayToString(params);
        Assert.assertEquals("null", result);
    }

}

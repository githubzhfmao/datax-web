package com.wugui.datax.admin.tool.datax.writer;

/**
 * sql server writer构建类
 *
 * @author zhouhongfa@gz-yibo.com
 * @version 1.0
 * @since 2019/8/2
 */
public class SqlServerlWriter extends BaseWriterPlugin implements DataxWriterInterface {

    @Override
    public String getName() {
        return "sqlserverwriter";
    }
}

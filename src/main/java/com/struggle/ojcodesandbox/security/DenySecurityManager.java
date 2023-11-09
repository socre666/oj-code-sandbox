package com.struggle.ojcodesandbox.security;

import java.security.Permission;

/**
 * @author Mr.Chen
 * 禁用所有权限的安全管理器
 */
public class DenySecurityManager extends SecurityManager {
    //检查所有的权限
    @Override
    public void checkPermission(Permission perm) {
        throw new SecurityException("权限异常,"+perm.toString());

    }

    @Override
    public void checkExec(String cmd) {
        super.checkExec(cmd);
    }

    @Override
    public void checkRead(String file, Object context) {
        super.checkRead(file, context);
    }

    @Override
    public void checkWrite(String file) {
        super.checkWrite(file);
    }

    @Override
    public void checkDelete(String file) {
        super.checkDelete(file);
    }

    @Override
    public void checkConnect(String host, int port) {
        super.checkConnect(host, port);
    }
}

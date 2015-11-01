package com.github.ompc.greys.core.util;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 反射工具类
 * Created by vlinux on 15/11/2.
 */
public class GaReflectUtils {

    /**
     * 计算ClassType
     *
     * @param targetClass 目标类
     * @return 计算出的ClassType
     */
    public static int computeClassType(Class<?> targetClass) {
        int type = 0;
        if (targetClass.isAnnotation())
            type |= TYPE_ANNOTATION;
        if (targetClass.isAnonymousClass())
            type |= TYPE_ANONYMOUS;
        if (targetClass.isArray())
            type |= TYPE_ARRAY;
        if (targetClass.isEnum())
            type |= TYPE_ENUM;
        if (targetClass.isInterface())
            type |= TYPE_INTERFACE;
        if (targetClass.isLocalClass())
            type |= TYPE_LOCAL;
        if (targetClass.isMemberClass())
            type |= TYPE_MEMBER;
        if (targetClass.isPrimitive())
            type |= TYPE_PRIMITIVE;
        if (targetClass.isSynthetic())
            type |= TYPE_SYNTHETIC;
        return type;
    }


    public static final int TYPE_ANNOTATION = 1 << 0;
    public static final int TYPE_ANONYMOUS = 1 << 1;
    public static final int TYPE_ARRAY = 1 << 2;
    public static final int TYPE_ENUM = 1 << 3;
    public static final int TYPE_INTERFACE = 1 << 4;
    public static final int TYPE_LOCAL = 1 << 5;
    public static final int TYPE_MEMBER = 1 << 6;
    public static final int TYPE_PRIMITIVE = 1 << 7;
    public static final int TYPE_SYNTHETIC = 1 << 8;

    /**
     * 默认类型(全匹配)
     */
    public static final int DEFAULT_TYPE =
            TYPE_ANNOTATION
                    | TYPE_ANONYMOUS | TYPE_ARRAY | TYPE_ENUM
                    | TYPE_INTERFACE | TYPE_LOCAL | TYPE_MEMBER
                    | TYPE_PRIMITIVE | TYPE_SYNTHETIC;


    /**
     * 计算类修饰符
     *
     * @param targetClass 目标类
     * @return 类修饰符
     */
    public static int computeClassModifier(Class<?> targetClass) {
        return targetClass.getModifiers();
    }

    /**
     * 计算方法修饰符
     *
     * @param targetMethod 目标方法
     * @return 方法修饰符
     */
    public static int computeMethodModifier(Method targetMethod) {
        return targetMethod.getModifiers();
    }


    public static final int MOD_PUBLIC = Modifier.PUBLIC;
    public static final int MOD_PRIVATE = Modifier.PRIVATE;
    public static final int MOD_PROTECTED = Modifier.PROTECTED;
    public static final int MOD_STATIC = Modifier.STATIC;
    public static final int MOD_FINAL = Modifier.FINAL;
    public static final int MOD_SYNCHRONIZED = Modifier.SYNCHRONIZED;
    public static final int MOD_VOLATILE = Modifier.VOLATILE;
    public static final int MOD_TRANSIENT = Modifier.TRANSIENT;
    public static final int MOD_NATIVE = Modifier.NATIVE;
    public static final int MOD_ABSTRACT = Modifier.ABSTRACT;
    public static final int MOD_STRICT = Modifier.STRICT;

    /**
     * 默认匹配修饰符(全匹配)
     */
    public static final int DEFAULT_MOD =
            MOD_FINAL
                    | MOD_PROTECTED | MOD_VOLATILE | MOD_STATIC | MOD_PUBLIC | MOD_SYNCHRONIZED
                    | MOD_TRANSIENT | MOD_ABSTRACT | MOD_NATIVE | MOD_STRICT | MOD_PRIVATE;

}

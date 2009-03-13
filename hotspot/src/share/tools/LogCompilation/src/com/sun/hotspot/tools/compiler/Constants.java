/*
 * Copyright 2009 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 *
 */

package com.sun.hotspot.tools.compiler;

interface Constants {
    static final int  JVM_ACC_PUBLIC        = 0x0001;  /* visible to everyone */
    static final int  JVM_ACC_PRIVATE       = 0x0002;  /* visible only to the defining class */
    static final int  JVM_ACC_PROTECTED     = 0x0004;  /* visible to subclasses */
    static final int  JVM_ACC_STATIC        = 0x0008;  /* instance variable is static */
    static final int  JVM_ACC_FINAL         = 0x0010;  /* no further subclassing, overriding */
    static final int  JVM_ACC_SYNCHRONIZED  = 0x0020;  /* wrap method call in monitor lock */
    static final int  JVM_ACC_SUPER         = 0x0020;  /* funky handling of invokespecial */
    static final int  JVM_ACC_VOLATILE      = 0x0040;  /* can not cache in registers */
    static final int  JVM_ACC_BRIDGE        = 0x0040;  /* bridge method generated by compiler */
    static final int  JVM_ACC_TRANSIENT     = 0x0080;  /* not persistent */
    static final int  JVM_ACC_VARARGS       = 0x0080;  /* method declared with variable number of args */
    static final int  JVM_ACC_NATIVE        = 0x0100;  /* implemented in C */
    static final int  JVM_ACC_INTERFACE     = 0x0200;  /* class is an interface */
    static final int  JVM_ACC_ABSTRACT      = 0x0400;  /* no definition provided */
    static final int  JVM_ACC_STRICT        = 0x0800;  /* strict floating point */
    static final int  JVM_ACC_SYNTHETIC     = 0x1000;  /* compiler-generated class, method or field */
    static final int  JVM_ACC_ANNOTATION    = 0x2000;  /* annotation type */
    static final int  JVM_ACC_ENUM          = 0x4000;  /* field is declared as element of enum */
}

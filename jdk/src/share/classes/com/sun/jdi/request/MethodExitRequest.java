/*
 * Copyright 1998-2001 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
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
 */

package com.sun.jdi.request;

import com.sun.jdi.*;

/**
 * Request for notification when a method returns in the target VM.
 * When an enabled MethodExitRequest is hit, an
 * {@link com.sun.jdi.event.EventSet event set} containing a
 * {@link com.sun.jdi.event.MethodExitEvent MethodExitEvent}
 * will be placed on the
 * {@link com.sun.jdi.event.EventQueue EventQueue}.
 * The collection of existing MethodExitRequests is
 * managed by the {@link EventRequestManager}
 *
 * @see com.sun.jdi.event.MethodExitEvent
 * @see com.sun.jdi.event.EventQueue
 * @see EventRequestManager
 *
 * @author Robert Field
 * @since  1.3
 */
public interface MethodExitRequest extends EventRequest {

    /**
     * Restricts the events generated by this request to those in
     * the given thread.
     * @param thread the thread to filter on.
     * @throws InvalidRequestStateException if this request is currently
     * enabled or has been deleted.
     * Filters may be added only to disabled requests.
     */
    void addThreadFilter(ThreadReference thread);

    /**
     * Restricts the events generated by this request to those whose
     * method is in the given reference type or any of its subtypes.
     * An event will be generated for any location in a reference type
     * that can be safely cast to the given reference type.
     *
     * @param refType the reference type to filter on.
     * @throws InvalidRequestStateException if this request is currently
     * enabled or has been deleted.
     * Filters may be added only to disabled requests.
     */
    void addClassFilter(ReferenceType refType);

    /**
     * Restricts the events generated by this request to those
     * whose method is in a class whose name matches a restricted
     * regular expression. Regular expressions are limited
     * to exact matches and patterns that begin with '*' or end with '*';
     * for example, "*.Foo" or "java.*".
     *
     * @param classPattern the pattern String to filter for.
     * @throws InvalidRequestStateException if this request is currently
     * enabled or has been deleted.
     * Filters may be added only to disabled requests.
     */
    void addClassFilter(String classPattern);

    /**
     * Restricts the events generated by this request to those
     * whose method is in a class whose name does <b>not</b> match this
     * restricted regular expression. Regular expressions are limited
     * to exact matches and patterns that begin with '*' or end with '*';
     * for example, "*.Foo" or "java.*".
     *
     * @param classPattern the pattern String to filter against.
     * @throws InvalidRequestStateException if this request is currently
     * enabled or has been deleted.
     * Filters may be added only to disabled requests.
     */
    void addClassExclusionFilter(String classPattern);

    /**
     * Restricts the events generated by this request to those in
     * which the currently executing instance ("this") is the object
     * specified.
     * <P>
     * Not all targets support this operation.
     * Use {@link VirtualMachine#canUseInstanceFilters()}
     * to determine if the operation is supported.
     * @since 1.4
     * @param instance the object which must be the current instance
     * in order to pass this filter.
     * @throws java.lang.UnsupportedOperationException if
     * the target virtual machine does not support this
     * operation.
     * @throws InvalidRequestStateException if this request is currently
     * enabled or has been deleted.
     * Filters may be added only to disabled requests.
     */
    void addInstanceFilter(ObjectReference instance);
}

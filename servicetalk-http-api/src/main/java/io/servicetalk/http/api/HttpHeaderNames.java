/*
 * Copyright © 2018 Apple Inc. and the ServiceTalk project authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.servicetalk.http.api;

import static io.servicetalk.http.api.CharSequences.newAsciiString;

/**
 * Common <a href="https://tools.ietf.org/html/rfc7231#section-5">request header names</a> and
 * <a href="https://tools.ietf.org/html/rfc7231#section-7">response header names</a>.
 */
public final class HttpHeaderNames {
    /**
     * {@code "accept"}
     */
    public static final CharSequence ACCEPT = newAsciiString("accept");
    /**
     * {@code "accept-charset"}
     */
    public static final CharSequence ACCEPT_CHARSET = newAsciiString("accept-charset");
    /**
     * {@code "accept-encoding"}
     */
    public static final CharSequence ACCEPT_ENCODING = newAsciiString("accept-encoding");
    /**
     * {@code "accept-language"}
     */
    public static final CharSequence ACCEPT_LANGUAGE = newAsciiString("accept-language");
    /**
     * {@code "accept-ranges"}
     */
    public static final CharSequence ACCEPT_RANGES = newAsciiString("accept-ranges");
    /**
     * {@code "accept-patch"}
     */
    public static final CharSequence ACCEPT_PATCH = newAsciiString("accept-patch");
    /**
     * {@code "access-control-allow-credentials"}
     */
    public static final CharSequence ACCESS_CONTROL_ALLOW_CREDENTIALS =
            newAsciiString("access-control-allow-credentials");
    /**
     * {@code "access-control-allow-headers"}
     */
    public static final CharSequence ACCESS_CONTROL_ALLOW_HEADERS =
            newAsciiString("access-control-allow-headers");
    /**
     * {@code "access-control-allow-methods"}
     */
    public static final CharSequence ACCESS_CONTROL_ALLOW_METHODS =
            newAsciiString("access-control-allow-methods");
    /**
     * {@code "access-control-allow-origin"}
     */
    public static final CharSequence ACCESS_CONTROL_ALLOW_ORIGIN =
            newAsciiString("access-control-allow-origin");
    /**
     * {@code "access-control-expose-headers"}
     */
    public static final CharSequence ACCESS_CONTROL_EXPOSE_HEADERS =
            newAsciiString("access-control-expose-headers");
    /**
     * {@code "access-control-max-age"}
     */
    public static final CharSequence ACCESS_CONTROL_MAX_AGE = newAsciiString("access-control-max-age");
    /**
     * {@code "access-control-request-headers"}
     */
    public static final CharSequence ACCESS_CONTROL_REQUEST_HEADERS =
            newAsciiString("access-control-request-headers");
    /**
     * {@code "access-control-request-method"}
     */
    public static final CharSequence ACCESS_CONTROL_REQUEST_METHOD =
            newAsciiString("access-control-request-method");
    /**
     * {@code "age"}
     */
    public static final CharSequence AGE = newAsciiString("age");
    /**
     * {@code "allow"}
     */
    public static final CharSequence ALLOW = newAsciiString("allow");
    /**
     * {@code "authorization"}
     */
    public static final CharSequence AUTHORIZATION = newAsciiString("authorization");
    /**
     * {@code "cache-control"}
     */
    public static final CharSequence CACHE_CONTROL = newAsciiString("cache-control");
    /**
     * {@code "connection"}
     */
    public static final CharSequence CONNECTION = newAsciiString("connection");
    /**
     * {@code "content-base"}
     */
    public static final CharSequence CONTENT_BASE = newAsciiString("content-base");
    /**
     * {@code "content-encoding"}
     */
    public static final CharSequence CONTENT_ENCODING = newAsciiString("content-encoding");
    /**
     * {@code "content-language"}
     */
    public static final CharSequence CONTENT_LANGUAGE = newAsciiString("content-language");
    /**
     * {@code "content-length"}
     */
    public static final CharSequence CONTENT_LENGTH = newAsciiString("content-length");
    /**
     * {@code "content-location"}
     */
    public static final CharSequence CONTENT_LOCATION = newAsciiString("content-location");
    /**
     * {@code "content-transfer-encoding"}
     */
    public static final CharSequence CONTENT_TRANSFER_ENCODING = newAsciiString("content-transfer-encoding");
    /**
     * {@code "content-disposition"}
     */
    public static final CharSequence CONTENT_DISPOSITION = newAsciiString("content-disposition");
    /**
     * {@code "content-md5"}
     */
    public static final CharSequence CONTENT_MD5 = newAsciiString("content-md5");
    /**
     * {@code "content-range"}
     */
    public static final CharSequence CONTENT_RANGE = newAsciiString("content-range");
    /**
     * {@code "content-security-policy"}
     */
    public static final CharSequence CONTENT_SECURITY_POLICY = newAsciiString("content-security-policy");
    /**
     * {@code "content-type"}
     */
    public static final CharSequence CONTENT_TYPE = newAsciiString("content-type");
    /**
     * {@code "cookie"}
     */
    public static final CharSequence COOKIE = newAsciiString("cookie");
    /**
     * {@code "date"}
     */
    public static final CharSequence DATE = newAsciiString("date");
    /**
     * {@code "etag"}
     */
    public static final CharSequence ETAG = newAsciiString("etag");
    /**
     * {@code "expect"}
     */
    public static final CharSequence EXPECT = newAsciiString("expect");
    /**
     * {@code "expires"}
     */
    public static final CharSequence EXPIRES = newAsciiString("expires");
    /**
     * <a href="https://tools.ietf.org/html/rfc7239#section-4">forwarded</a> is a header field that contains a list of
     * parameter-identifier pairs that disclose information that is altered or lost when a proxy is involved in the path
     * of the request.
     * <p>
     * The alternative and de-facto standard versions of this header are the {@link #X_FORWARDED_FOR "x-forwarded-for"},
     * {@link #X_FORWARDED_HOST "x-forwarded-host"} and {@link #X_FORWARDED_PROTO "x-forwarded-proto"} headers.
     */
    public static final CharSequence FORWARDED = newAsciiString("forwarded");
    /**
     * {@code "from"}
     */
    public static final CharSequence FROM = newAsciiString("from");
    /**
     * {@code "host"}
     */
    public static final CharSequence HOST = newAsciiString("host");
    /**
     * {@code "if-match"}
     */
    public static final CharSequence IF_MATCH = newAsciiString("if-match");
    /**
     * {@code "if-modified-since"}
     */
    public static final CharSequence IF_MODIFIED_SINCE = newAsciiString("if-modified-since");
    /**
     * {@code "if-none-match"}
     */
    public static final CharSequence IF_NONE_MATCH = newAsciiString("if-none-match");
    /**
     * {@code "if-range"}
     */
    public static final CharSequence IF_RANGE = newAsciiString("if-range");
    /**
     * {@code "if-unmodified-since"}
     */
    public static final CharSequence IF_UNMODIFIED_SINCE = newAsciiString("if-unmodified-since");
    /**
     * {@code "last-modified"}
     */
    public static final CharSequence LAST_MODIFIED = newAsciiString("last-modified");
    /**
     * {@code "location"}
     */
    public static final CharSequence LOCATION = newAsciiString("location");
    /**
     * {@code "max-forwards"}
     */
    public static final CharSequence MAX_FORWARDS = newAsciiString("max-forwards");
    /**
     * {@code "origin"}
     */
    public static final CharSequence ORIGIN = newAsciiString("origin");
    /**
     * {@code "pragma"}
     */
    public static final CharSequence PRAGMA = newAsciiString("pragma");
    /**
     * {@code "proxy-authenticate"}
     */
    public static final CharSequence PROXY_AUTHENTICATE = newAsciiString("proxy-authenticate");
    /**
     * {@code "proxy-authorization"}
     */
    public static final CharSequence PROXY_AUTHORIZATION = newAsciiString("proxy-authorization");
    /**
     * {@code "range"}
     */
    public static final CharSequence RANGE = newAsciiString("range");
    /**
     * {@code "referer"}
     */
    public static final CharSequence REFERER = newAsciiString("referer");
    /**
     * {@code "retry-after"}
     */
    public static final CharSequence RETRY_AFTER = newAsciiString("retry-after");
    /**
     * {@code "sec-websocket-key1"}
     */
    public static final CharSequence SEC_WEBSOCKET_KEY1 = newAsciiString("sec-websocket-key1");
    /**
     * {@code "sec-websocket-key2"}
     */
    public static final CharSequence SEC_WEBSOCKET_KEY2 = newAsciiString("sec-websocket-key2");
    /**
     * {@code "sec-websocket-location"}
     */
    public static final CharSequence SEC_WEBSOCKET_LOCATION = newAsciiString("sec-websocket-location");
    /**
     * {@code "sec-websocket-origin"}
     */
    public static final CharSequence SEC_WEBSOCKET_ORIGIN = newAsciiString("sec-websocket-origin");
    /**
     * {@code "sec-websocket-protocol"}
     */
    public static final CharSequence SEC_WEBSOCKET_PROTOCOL = newAsciiString("sec-websocket-protocol");
    /**
     * {@code "sec-websocket-version"}
     */
    public static final CharSequence SEC_WEBSOCKET_VERSION = newAsciiString("sec-websocket-version");
    /**
     * {@code "sec-websocket-key"}
     */
    public static final CharSequence SEC_WEBSOCKET_KEY = newAsciiString("sec-websocket-key");
    /**
     * {@code "sec-websocket-accept"}
     */
    public static final CharSequence SEC_WEBSOCKET_ACCEPT = newAsciiString("sec-websocket-accept");
    /**
     * {@code "sec-websocket-protocol"}
     */
    public static final CharSequence SEC_WEBSOCKET_EXTENSIONS = newAsciiString("sec-websocket-extensions");
    /**
     * {@code "server"}
     */
    public static final CharSequence SERVER = newAsciiString("server");
    /**
     * {@code "set-cookie"}
     */
    public static final CharSequence SET_COOKIE = newAsciiString("set-cookie");
    /**
     * {@code "set-cookie2"}
     */
    public static final CharSequence SET_COOKIE2 = newAsciiString("set-cookie2");
    /**
     * {@code "te"}
     */
    public static final CharSequence TE = newAsciiString("te");
    /**
     * {@code "trailer"}
     */
    public static final CharSequence TRAILER = newAsciiString("trailer");
    /**
     * {@code "transfer-encoding"}
     */
    public static final CharSequence TRANSFER_ENCODING = newAsciiString("transfer-encoding");
    /**
     * {@code "upgrade"}
     */
    public static final CharSequence UPGRADE = newAsciiString("upgrade");
    /**
     * {@code "user-agent"}
     */
    public static final CharSequence USER_AGENT = newAsciiString("user-agent");
    /**
     * {@code "vary"}
     */
    public static final CharSequence VARY = newAsciiString("vary");
    /**
     * {@code "via"}
     */
    public static final CharSequence VIA = newAsciiString("via");
    /**
     * {@code "warning"}
     */
    public static final CharSequence WARNING = newAsciiString("warning");
    /**
     * {@code "websocket-location"}
     */
    public static final CharSequence WEBSOCKET_LOCATION = newAsciiString("websocket-location");
    /**
     * {@code "websocket-origin"}
     */
    public static final CharSequence WEBSOCKET_ORIGIN = newAsciiString("websocket-origin");
    /**
     * {@code "websocket-protocol"}
     */
    public static final CharSequence WEBSOCKET_PROTOCOL = newAsciiString("websocket-protocol");
    /**
     * {@code "www-authenticate"}
     */
    public static final CharSequence WWW_AUTHENTICATE = newAsciiString("www-authenticate");
    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-For">x-forwarded-for</a> (XFF)
     * header is a de-facto standard header for identifying the originating IP address of a client connecting to a web
     * server through an HTTP proxy or a load balancer.
     * <p>
     * A standardized version of this header is the HTTP {@link #FORWARDED "forwarded"} header.
     */
    public static final CharSequence X_FORWARDED_FOR = newAsciiString("x-forwarded-for");
    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Host">x-forwarded-host</a> (XFH)
     * header is a de-facto standard header for identifying the original host requested by the client in the
     * {@link #HOST host} HTTP request header.
     * <p>
     * A standardized version of this header is the HTTP {@link #FORWARDED "forwarded"} header.
     */
    public static final CharSequence X_FORWARDED_HOST = newAsciiString("x-forwarded-host");
    /**
     * <a href="https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Forwarded-Proto">x-forwarded-proto</a> (XFP)
     * header is a de-facto standard header for identifying the protocol (HTTP or HTTPS) that a client used to connect
     * to your proxy or load balancer.
     * <p>
     * A standardized version of this header is the HTTP {@link #FORWARDED "forwarded"} header.
     */
    public static final CharSequence X_FORWARDED_PROTO = newAsciiString("x-forwarded-proto");
    /**
     * {@code "x-requested-with"} is not a standard, but wildly used by most JavaScript frameworks header to identify
     * <a href="https://developer.mozilla.org/en-US/docs/Web/Guide/AJAX">Ajax</a> requests. Usually frameworks send this
     * header with value of {@link HttpHeaderValues#XML_HTTP_REQUEST XMLHttpRequest}.
     */
    public static final CharSequence X_REQUESTED_WITH = newAsciiString("x-requested-with");

    private HttpHeaderNames() {
        // No instances
    }
}

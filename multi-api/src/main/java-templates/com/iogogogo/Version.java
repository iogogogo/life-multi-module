package com.iogogogo;

/**
 * Created by tao.zeng on 2019-05-12.
 */
public final class Version {

    /**
     * project version
     */
    public static final String VERSION = "${project.version}";
    /**
     * artifact id
     */
    public static final String ARTIFACTID = "${artifactId}";
    /**
     * build timestamp
     */
    public static final String TIMESTAMP = "${timestamp}";
    /**
     * build description
     */
    public static final String DESCRIPTION = "${description}";
}

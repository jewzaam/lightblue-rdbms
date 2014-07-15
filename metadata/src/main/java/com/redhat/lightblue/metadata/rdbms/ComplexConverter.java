package com.redhat.lightblue.metadata.rdbms;

import com.redhat.lightblue.metadata.parser.MetadataParser;

public interface ComplexConverter {
    public abstract <T> void convert(MetadataParser<T> p, Object lastArrayNode, T node);

}

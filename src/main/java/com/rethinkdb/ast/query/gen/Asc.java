package com.rethinkdb.ast.query.gen;

import com.rethinkdb.ast.query.RqlQuery;
import com.rethinkdb.proto.Q2L;

import java.util.List;
import java.util.Map;

// extends RqlTopLevelQuery
public class Asc extends RqlQuery {

    public Asc(List<Object> args, java.util.Map<String, Object> optionalArgs) {
        this(null, args, optionalArgs);
    }

    public Asc(RqlQuery prev, List<Object> args, Map<String, Object> optionalArgs) {
        super(prev, Q2L.Term.TermType.ASC, args, optionalArgs);
    }
}
        
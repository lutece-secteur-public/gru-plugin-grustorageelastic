/*
 * Copyright (c) 2002-2015, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.grustorageelastic.util.constant;


/**
 *
 * GRUElasticsConstants
 *
 */
public final class GRUElasticsConstants
{
    // CONSTANTS
    public static final String PLUGIN_NAME = "elasticsearch/";
    public static final String PATH_ELASTIC_AUTOCOMPLETION = "autocomplete";
    public static final String PATH_ELK_SUGGEST = "_suggest";
    public static final String PATH_ELK_SEARCH = "_search";

    // PATHS
    public static final String PATH_ELK_SERVER = "grustorage-elastics.urlElk";
    public static final String PATH_ELK_PATH = "grustorage-elastics.path";
    public static final String PATH_ELK_TYPE_DEMAND = "grustorage-elastics.pathDemand";
    public static final String PATH_ELK_TYPE_USER = "grustorage-elastics.pathUser";
    public static final String PATH_ELK_TYPE_NOTIFICATION = "grustorage-elastics.pathNotification";

    //MARKERS
    public static final String MARKER_AUTOCOMPLETE = "autocomplete";
    public static final String MARKER_ITEM = "item";
    public static final String MARKER_USER_CID = "user_cid";
    public static final String MARKER_DEMAND_TYPE_ID = "demand_type_id";
    public static final String MARKER_DEMAND_ID = "demand_id";
    public static final String MARKER_REFERENCE = "reference";
    public static final String MARKER_FIRST_NAME = "first_name";
    public static final String MARKER_LAST_NAME = "last_name";
    public static final String MARKER_ELEMENTS = "elements";
    public static final String MARKER_PAYLOAD = "payload";

    /**
     * Instantiates a new GRU elastics constants.
     */
    private GRUElasticsConstants(  )
    {
    }
}

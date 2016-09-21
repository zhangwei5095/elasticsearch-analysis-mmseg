/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.analysis;

import com.chenlb.mmseg4j.analysis.MMSegAnalyzer;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.env.Environment;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettingsService;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: Medcl'
 * Date: 8/2/11
 * Time: 4:44 PM
 */
@Deprecated
public class MMsegAnalyzerProvider extends AbstractIndexAnalyzerProvider<MMSegAnalyzer>  {

     private final MMSegAnalyzer analyzer;

    @Inject
    public MMsegAnalyzerProvider(Index index, IndexSettingsService indexSettings, Environment env, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings.getSettings(), name, settings);
        analyzer=new MMSegAnalyzer();
    }
    @Override public MMSegAnalyzer get() {
        return this.analyzer;
    }
}

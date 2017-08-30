/*******************************************************************************
 * Copyright (c) 2011, 2016 Eurotech and/or its affiliates and others
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Eurotech - initial API and implementation
 *******************************************************************************/
package org.eclipse.kapua.service.job.execution.internal;

import java.util.Date;

import org.eclipse.kapua.commons.model.AbstractKapuaEntityCreator;
import org.eclipse.kapua.locator.KapuaProvider;
import org.eclipse.kapua.model.id.KapuaId;
import org.eclipse.kapua.service.job.execution.JobExecution;
import org.eclipse.kapua.service.job.execution.JobExecutionCreator;

/**
 * {@link JobExecutionDefinitionCreator} encapsulates all the information needed to create a new JobExecutionDefinition in the system.<br>
 * The data provided will be used to seed the new JobExecutionDefinition.
 * 
 * @since 1.0.0
 *
 */
@KapuaProvider
public class JobExecutionCreatorImpl extends AbstractKapuaEntityCreator<JobExecution> implements JobExecutionCreator {

    private static final long serialVersionUID = 3119071638220738358L;

    private KapuaId jobId;
    private Date startedOn;

    protected JobExecutionCreatorImpl(KapuaId scopeId) {
        super(scopeId);
    }

    @Override
    public KapuaId getJobId() {
        return jobId;
    }

    @Override
    public void setJobId(KapuaId jobId) {
        this.jobId = jobId;
    }

    @Override
    public Date getStartedOn() {
        return startedOn;
    }

    @Override
    public void setStartedOn(Date startedOn) {
        this.startedOn = startedOn;
    }
}

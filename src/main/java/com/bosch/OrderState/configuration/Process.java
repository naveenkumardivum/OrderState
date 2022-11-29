/*Copyright © 2019 Robert Bosch Engineering and Business Solutions Private Limited. All Rights Reserved.

NOTICE:  All information contained herein is, and remains the property of Robert Bosch Engineering and Business Solutions Private Limited.
Dissemination of this information or reproduction of this material is strictly forbidden unless prior written permission is obtained from 
Robert Bosch Engineering and Business Solutions Private Limited.

*/
package com.bosch.OrderState.configuration;

import java.util.List;

public class Process {
    private SequenceFlow[] sequenceFlow;

    private List<Task> task;

    private String name;

    private String id;

    private String isExecutable;

    public SequenceFlow[] getSequenceFlow() {
        return sequenceFlow;
    }

    public void setSequenceFlow(SequenceFlow[] sequenceFlow) {
        this.sequenceFlow = sequenceFlow;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsExecutable() {
        return isExecutable;
    }

    public void setIsExecutable(String isExecutable) {
        this.isExecutable = isExecutable;
    }

    @Override
    public String toString() {
        return "Class Process [sequenceFlow = " + sequenceFlow + ", task = " + task + ", name = " + name + ", id = "
                + id + ", isExecutable = " + isExecutable + "]";
    }
}

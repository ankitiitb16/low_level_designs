package com.projects.low_level_designs.parking_lot.strategies;

import com.projects.low_level_designs.parking_lot.models.SlotAssignmentStrategyType;

public class SlotAssignmentStrategyFactory {
    public static SlotAssignmentStrategy getSlotForType(SlotAssignmentStrategyType slotAssignmentStrategyType){
        if(slotAssignmentStrategyType.equals(SlotAssignmentStrategyType.RANDOM))
            return new RandomSlotAssignmentStrategy();
        else if(slotAssignmentStrategyType.equals(SlotAssignmentStrategyType.NEAREST)){
            return null;
        }
        return null;
    }
}

package business_logic.orchestration;

import exceptions.OrchestratorException;
import persistence.entities.Worker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public abstract class AbstractOrchestrator<Producer extends Callable<Integer>,Consumer extends Callable<Integer>>  {
    List<Producer> producers;
    List<Consumer> consumers;
    ExecutorService executorService;
    int threadAmount = 4;
    List<Worker> notSentWorkers = new ArrayList<>();
    List<Worker> dupEmailsWorkers = new ArrayList<>();

    public abstract void orchestrate() throws OrchestratorException;


}

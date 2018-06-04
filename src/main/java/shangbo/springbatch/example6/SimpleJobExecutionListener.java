package shangbo.springbatch.example6;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class SimpleJobExecutionListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("SimpleJobExecutionListener.beforeJob");
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("SimpleJobExecutionListener.afterJob");
	}

}

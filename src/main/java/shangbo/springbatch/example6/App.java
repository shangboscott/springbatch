package shangbo.springbatch.example6;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		ApplicationContext context = new ClassPathXmlApplicationContext("shangbo/springbatch/example6/LoadFileJob.xml");

		// job 和 job 参数
		Map<String,JobParameter> parameters = new HashMap<>();
		parameters.put("business_date", new JobParameter("20170705"));
		JobParameters jobParameters = new JobParameters(parameters);
		Job job = context.getBean(Job.class);

		// 运行 job
		JobLauncher jobLauncher = context.getBean(JobLauncher.class);
		jobLauncher.run(job, jobParameters);
	}
}

package shangbo.springbatch.example6;

import org.springframework.batch.core.ChunkListener;
import org.springframework.batch.core.scope.context.ChunkContext;

public class SimpleChunkListener implements ChunkListener {

	@Override
	public void beforeChunk(ChunkContext context) {
		System.out.println("SimpleChunkListener.beforeChunk");
	}

	@Override
	public void afterChunk(ChunkContext context) {
		System.out.println("SimpleChunkListener.afterChunk");
	}

	@Override
	public void afterChunkError(ChunkContext context) {
		System.out.println("SimpleChunkListener.afterChunkError");
	}

}

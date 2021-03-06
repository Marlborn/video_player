package tv.danmaku.ijk.media.player.threadutils.task;


import tv.danmaku.ijk.media.player.threadutils.thread.IThread;

/**
 * Created by guohaiyang on 2017/6/30.
 */

public abstract class MainTask extends AbsTask {

    public MainTask() {

    }

    public MainTask(int delay) {
        this.delayTime = delay;
    }

    @Override
    public IThread getThread() {
        return AbsTask.MAIN;
    }
}

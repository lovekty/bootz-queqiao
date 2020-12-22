package cn.bootz.queqiao.core.server

import org.apache.thrift.server.TServer

/**
 * @author tony.zhuby
 * @date 2020/12/17
 */
class NettyServer(args: AbstractServerArgs<*>) : TServer(args) {
    override fun serve() {
        TODO("Not yet implemented")
    }
}
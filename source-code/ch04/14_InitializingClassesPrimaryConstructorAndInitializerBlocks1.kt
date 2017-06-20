package ch04.InitializingClassesPrimaryConstructorAndInitializerBlocks1

class User constructor(_nickname: String) {
    val nickname: String

    init {
        nickname = _nickname
    }
}

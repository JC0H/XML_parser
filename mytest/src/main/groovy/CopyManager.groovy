
def dir = new File(/Documents\currentDir !_cesja.pdf/)
def toDir = new File(/Documents\anoutherDir  !_cesja.pdf/)

new AntBuilder().copy( todir: toDir ) {
    fileset( dir:dir )
}

new File('c:/temp/dst.txt') << new File('c:/temp/src.txt').text

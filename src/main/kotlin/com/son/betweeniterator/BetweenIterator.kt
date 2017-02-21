package com.son.betweeniterator

class BetweenIterator<T> (val iterable: Iterable<T>) : Iterator<Pair<T, T>> {
    private val currentIter = iterable.iterator()
    private var nextIter = com.son.cycliciterator.CyclicIterator(iterable)

    init {
        nextIter.next()
    }

    override fun next(): Pair<T, T> = Pair<T, T>(currentIter.next(), nextIter.next())
    override fun hasNext(): Boolean = currentIter.hasNext()
}


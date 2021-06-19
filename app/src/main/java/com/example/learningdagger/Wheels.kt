package com.example.learningdagger

import javax.inject.Inject

// we don't own this class, therefore we can't annotate the constructor
class Wheels (
    private val rims: Rims,
    private val tires: Tires
        ) {

}


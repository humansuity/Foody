package com.humansuit.foody.utils

import timber.log.Timber

object Constants {

    //const val API_KEY = "723aa747c8b14ae0853f6f96e40567d6"
    const val API_KEY = "d21f624f4eac427eb5d6bac03302b348"

    const val RECIPES_BASE_URL = "https://api.spoonacular.com/recipes/"
    const val RECIPE_PAGE_SIZE = 10
    const val AMOUNT_OF_PAGES = 5

    object ErrorMessage {

        const val ON_ERROR = "There is a problem with data loading, try to reload..."
        const val ON_EXCEPTION = "There are any server problems, try to reload..."
        const val ON_FAILURE = "Oops, something went wrong..."

    }


    val API_ERROR_LOG = { message: String -> Timber.e(message) }

}
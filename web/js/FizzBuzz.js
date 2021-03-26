var FizzBuzz = (function () {

    const endpoint = 'http://localhost:8080/fizzBuzz/';
    const fizzBuzzInputStart = document.getElementById('fizz-buzz-range-start');
    const fizzBuzzInputFinish = document.getElementById('fizz-buzz-range-finish');
    const fizzBuzzOutput = document.getElementById('fizz-buzz-output-area');
    const NonNumericValuesError = 'Please make sure inputs have numeric values';

    const loadFizzBuzz = async () => {
        const start = fizzBuzzInputStart.value;
        const finish = fizzBuzzInputFinish.value;
        const params = {
            start: start,
            finish: finish
        }
        const queryString = Object.keys(params).map(key => key + '=' + params[key]).join('&');
        const response = await fetch(endpoint + '?' + queryString, {
            method: 'GET'
        });

        if (response.status === 200) {
            return await response.text();
        } else {
            if (response.status >= 500 && response.status < 600) {
                throw new Error("Server error");
            }
            if (response.status === 400) {
                throw new Error("Please make sure input values are correct");
            }
        }
    }

    const validateFieldValues = () => {
        let start = fizzBuzzInputStart.value;
        let finish = fizzBuzzInputFinish.value;
        try {
            if (typeof start === 'undefined' || start.length === 0) {
                throw new Error(NonNumericValuesError);
            }
            if (typeof start === 'undefined' || start.length === 0) {
                throw new Error(NonNumericValuesError);
            }
            start = parseInt(start);
            finish = parseInt(finish);
            if (finish <= start) {
                throw new Error("Please make sure start value is less than finish value");
            }
        } catch (error) {
            fizzBuzzOutput.innerHTML = error.message;
            return false;
        }

        return true;
    }

    const fizzBuzzChangeTrigger = () => {
        if (validateFieldValues()) {
            loadFizzBuzz().then((data) => {
                fizzBuzzOutput.innerHTML = data;
            }).catch((error) => {
                fizzBuzzOutput.innerHTML = error.message;
            });
        }
    }

    const bindFizzBuzz = () => {
        fizzBuzzInputStart.addEventListener("change", fizzBuzzChangeTrigger);
        fizzBuzzInputFinish.addEventListener("change", fizzBuzzChangeTrigger);
    }
    return {
        bindFizzBuzz: bindFizzBuzz
    }

})();
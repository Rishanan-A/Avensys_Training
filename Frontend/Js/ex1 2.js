let numbers = [1, 2, 3, 4];

        while (true) {
            let input = prompt("Enter a number:");
            if (parseInt(input) === 0) {
                break; 
            }
            numbers.push(parseInt(input));
        }

        console.log(numbers);
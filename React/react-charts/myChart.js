import { Bar, Line, Scatter, Bubble, Doughnut } from "react-chartjs-2";
import { worldCovidData } from "./covidData";
import { useState, useEffect } from "react";

export function MyChart() {
    const [chartData, setChartData] = useState(null);

    useEffect(() => {
        setChartData({
            labels: worldCovidData.map((item) => item.year),
            datasets: [{
                label: 'Worldwide Covid Cases',
                data: worldCovidData.map((item) => item.covidCases),
                backgroundColor: ["red", "blue", "green"], 
                borderColor: 'black',
                borderWidth: 3,
            }]
        })
    }, []);

    const options = {
        responsive: true,
        plugins: {
            title: {
                display: true,
                text: 'Worldwide Covid Cases Over Time',
                fontSize: 20,
                padding: { top: 10, bottom: 30 }
            },
            legend: {
                display: false,
            },
            tooltips: {
                callbacks: {
                    label: function(tooltipItem, data) {
                        return `${data.labels[tooltipItem.index]}: ${data.datasets[0].data[tooltipItem.index]} cases`;
                    },
                },
            },
        },
        scales: {
            x: {
                title: {
                    display: true,
                    text: 'Year',
                },
            },
            y: {
                title: {
                    display: true,
                    text: 'Covid Cases',
                },
                beginAtZero: true,
            },
        },
    };

    return chartData ? (
        <div style={{ width: 600, height: 600 }}>
            <Bar data={chartData} options={options} />
            <Line data={chartData} options={options} />
            <Scatter data={chartData} options={options} />
            <Bubble data={chartData} options={options} />
            <Doughnut data={chartData} options={options} />
        </div>
    ) : null;
}
